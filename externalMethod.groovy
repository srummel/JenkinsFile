// Methods in this file will end up as object methods on the object that load returns.

def executePowershell(){
    echo "IN executePowershell"
	
    executeOnShell('C:/_development/putty.exe', new File("C:/_development/"))
    
	echo "IN executePowershell:: After execute call"

}

def executeOnShell(String command) {
  return executeOnShell(command, new File(System.properties.'user.dir'))
}
 
private def executeOnShell(String command, File workingDir) {
  println command
  def process = new ProcessBuilder(addShellPrefix(command))
                                    .directory(workingDir)
                                    .redirectErrorStream(true) 
                                    .start()
  process.inputStream.eachLine {println it}
  process.waitFor();
  return process.exitValue()
}
 
return this;