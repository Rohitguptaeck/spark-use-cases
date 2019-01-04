package com.gupta.rohit.spark

import main.scala.com.gupta.rohit.spark.util.SparkBuilder

/***
  * Driver Object with main method
  */
object SampleSparkDriver {

  case class Person(name:String, address: String, city: String, zip:Int)

  def main( args : Array[String]): Unit ={

    //set up Spark session
    val spark = SparkBuilder.getSparkSession

    //read csv file
    val csvInputDf = spark.read.option("header","true").csv("src/main/resources/inputData.csv")

    csvInputDf.show(false)



  }

}
