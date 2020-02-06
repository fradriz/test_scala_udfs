package com.digitas.test_scala

import org.apache.spark.sql.api.java.UDF1

class addOne extends UDF1[Integer, Integer] {
  def call(x: Integer): Integer = x + 1
}

/**
 Steps to call scala UDF from pyspark ...

# Pass the jar to the PySpark session
$ pyspark --jars /home/spineds/src/01_scala_2.12-0.1.jar

>>> from pyspark.sql.types import IntegerType
>>> spark.udf.registerJavaFunction("funcion_test", "com.digitas.test_scala.udf_test", IntegerType())

>>> spark.sql("""SELECT addUno(10) as nuevaColumna""").show()
+------------+
|nuevaColumna|
+------------+
|          11|
+------------+
 */