package com.digitas.test_scala

import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions.udf

/**
This ain't working yet ...
 */

class udf_test {

  object Tiempo {
    def time[R](block: => R): R = {
      val t0 = System.nanoTime()
      val result = block // call-by-name
      val t1 = System.nanoTime()
      //println("Elapsed time: " + (t1 - t0) + "ns")
      println("Elapsed time: " + (t1 - t0) / 1e9d + " secs")
      result
    }
  }

  object udfScalaTest {
    def funcion(t1: Int): Int = t1 + 5

    val function_udf: UserDefinedFunction = udf[Int, Int](this.funcion)
  }

}

/*
object prueba {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.master("local[*]").getOrCreate()
    val sqlContext = spark.sqlContext
    import sqlContext.implicits._

    val df2 = Seq((1, "hello", 10, 100), (2, "world", 20, 200)).toDF("id", "text", "nro1", "nro2")

    df2.show()
    //df2.withColumn("nro_agregado", new udfScalaTest()('nro1)).show()

    df2.withColumn("nro_agregado", udfScalaTest.function_udf('nro1)).show
  }
}
*/



