package test.scala.com

import org.apache.spark.{SparkConf, SparkContext}
/**
  * Created by Faliherizo on 06/02/2017.
  */
object MaxPrice {
    def main(args: Array[String]):Unit={
      val logFile = "/Users/Faliherizo/input.txt"
      val logFile2 = "/Users/Faliherizo/result.txt"
      val conf = new SparkConf().setAppName("Max Price").setMaster("local[*]")
      val sc = new SparkContext(conf)
      sc.textFile(logFile)
        .map(_.split(","))
        .map(rec => ((rec(0).split("-"))(0).toInt, rec(1).toFloat))
        .reduceByKey((a,b) => Math.max(a,b))
        .saveAsTextFile(logFile2)
    }
}
