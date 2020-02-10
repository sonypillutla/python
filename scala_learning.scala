// Databricks notebook source
// val , var
val variable1: String = "hello world!"

// COMMAND ----------

var variable1_var:String="hellllo"
variable1_var


// COMMAND ----------

var value1="world"

// COMMAND ----------

val variable1="hey"
variable1=variable1+"world!"

// COMMAND ----------

var value2="hey"
value2="hey"+"world"

// COMMAND ----------

val var_byte:Byte=126
var_byte + 3
val val_int:Int=2
print(f"hello, $val_int")

// COMMAND ----------

var n:Int=3
n match{
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("find value 3")
  case _ => print("not found")
}

// COMMAND ----------

var a=2
if(a==2)
{
  print("2")
}
else
{
  print("no value")
}

// COMMAND ----------

for(i <- 1 to 4)
{
  println(i)
}

// COMMAND ----------

var wh=4
while(wh >= 0)
{
  print(f"wh,$wh")
  wh=wh-1
}

// COMMAND ----------

def squareInt(x:Int):Int={
  x*x
}
squareInt(2)

// COMMAND ----------

def noDivisor(x:Int,y:Int):Float={
  x/y
}
noDivisor(5,2)

// COMMAND ----------

def table(x:Int):Unit={
for(i<-1 to 10)
  {
    var a=x*i
  println(f"$x*$i=$a")
  }
}
table(5)

// COMMAND ----------

def fun(x:Double,y:Double):Double={
  x/y}
fun(4,2)

// COMMAND ----------

def fun(x:Double,y:Double):Double={
  x/y
}
def addNumber(variable1:Double,variable2:Double,func:(Double,Double) => Double):Double={
    func(variable1,variable2)
  }
addNumber(10,2,fun)

// COMMAND ----------

val tup=("hello","sony",21)
tup._1

// COMMAND ----------

var list1=List("sony","pillutla")
list1.head

// COMMAND ----------

var dic=1->"hello"
dic._2

// COMMAND ----------

var l1=List("sony",21)
var l2=List("pillutla")
l1++l2

// COMMAND ----------

var newlist=List(1,2,3,4,5)
newlist.filter((x:Int)=>x!=4)

// COMMAND ----------

var liststring=List("hey","hello")
liststring.map((x:String)=>x.length)

// COMMAND ----------

var newlist=List(1,2,3,4,5)
newlist.reduce((x:Int,y:Int)=>x+y)

// COMMAND ----------

var newlist=List(1,2,3,4,5)
newlist.map((x:Int)=>(x,2))

// COMMAND ----------

var ss:Byte=124
ss.toString
