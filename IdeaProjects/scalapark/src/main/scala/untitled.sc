val bank = spark.read.format("csv").option("header","true").option("path","bank2.csv").load()
bank.show()