package test

import java.io.BufferedReader
import java.io.FileReader

fun main(){
    val br = BufferedReader(FileReader("test/aq-products-api.json"))
    println(br.readText())
    br.close()
}