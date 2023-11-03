import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.graphx._

object SimpleGraphExample {
  def main(args: Array[String]): Unit = {
    // 1. Create a SparkConf object with an app name
    val conf = new SparkConf().setAppName("SimpleGraphExample")
    
    // 2. Create a SparkContext using the SparkConf
    val sc = new SparkContext(conf)
    
    // 3. Create a list of vertices
    val vertices = sc.makeRDD(Array((1L, "Alice"), (2L, "Bob"), (3L, "Charlie")))
    
    // 4. Create a list of edges
    val edges = sc.makeRDD(Array(Edge(1L, 2L, "Friend"), Edge(2L, 3L, "Friend")))
    
    // 5. Create a Graph from the vertices and edges
    val graph = Graph(vertices, edges)
    
    // 6. Print the graph's vertices and edges
    graph.vertices.collect().foreach(println)
    graph.edges.collect().foreach(println)
    
    // 7. Stop the SparkContext
    sc.stop()
  }
}
