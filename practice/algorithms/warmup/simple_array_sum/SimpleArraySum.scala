object SimpleArraySum extends App {
  var console = io.Source.stdin.bufferedReader()
  val n = console.readLine().toInt;
  println(console.readLine().split(" ").map(_.toInt).sum)
}