package main.scala.com.gupta.rohit.spark.util

import org.apache.spark.sql.SparkSession

object SparkBuilder {

  def getSparkSession : SparkSession = {

    val spark  = SparkSession.builder()
    .master("local[*]")
    .appName("SampleSparkJob")
    .getOrCreate()

    spark
  }

}
