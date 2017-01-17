{ ->
  node('special-agent') {
    hello("world")
  }
}
def hello(whom) {
  echo "hello ${whom}"
}