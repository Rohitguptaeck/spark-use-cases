/***
  * Driver Object with main method
  */
object SampleSparkDriver {

  def main( args : Array[String]): Unit ={
    print("Hello World")

    //set up Spark session
    val spark = SparkBuilder.getSparkSession

    //read a text file
    val inputDf = spark.read.text("src/main/resources/sampleSparkInput.txt")
    //
    inputDf.show(false)



  }

}
