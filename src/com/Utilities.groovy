
/// Methods in this file will end up as object methods on the object that load returns.
static def hello(String uuid) {
    echo "Look at this, ${uuid}! You loaded this from another file!"
}
return this;
   