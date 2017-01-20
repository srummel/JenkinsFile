// Methods in this file will end up as object methods on the object that load returns.

def executePowershell(){
    echo "IN executePowershell"
	
//def process = ["bat C:/Windows/System32/WindowsPowerShell/v1.0/powershell.exe -ExecutionPolicy ByPass -File  C:/logfile.ps1 -DIRECTORY C:/foo"].execute()  
def process = ["First.bat"].execute()  
process.waitFor()  
println process.exitValue()  
println process.in.text  
println process.err.text  
    
	echo "IN executePowershell:: After execute call"

}

//def executeOnShell(String command) {
//  return executeOnShell(command, new File(System.properties.'user.dir'))
//}
 
def executeOnShell(String command, File workingDir) {
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