// Methods in this file will end up as object methods on the object that load returns.

def executePowershell(){
    echo "IN executePowershell"
	
//  def process = ["bat C:/Windows/System32/WindowsPowerShell/v1.0/powershell.exe -ExecutionPolicy ByPass -File  C:/logfile.ps1 -DIRECTORY C:/foo"].execute()  
//  def process = "cmd /c First.bat".execute()  
//  ProcessBuilder pb = new ProcessBuilder("C:/Windows/System32/WindowsPowerShell/v1.0/powershell.exe");
//  pb.directory(new File("C:/foo"));
//  pb. redirectErrorStream(true);

//  Process p = pb.start();
//

//  Process p = Runtime.getRuntime().exec("cmd /c mkdir c:/tmp/foo", null , new File("C:/tmp"));



  ProcessBuilder pb = new ProcessBuilder("C:/Windows/System32/WindowsPowerShell/v1.0/powershell.exe", "-File", "C:/foo/logfile.ps1", "-DIRECTORY", "C:/foo");
  pb.directory(new File("C:/foo"));
  pb.redirectErrorStream(true);

Process p = pb.start();
BufferedReader output = new BufferedReader(new InputStreamReader(p.getInputStream()));
BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
String ligne = "";

while ((ligne = output.readLine()) != null) {
    System.out.println(ligne);
}

while ((ligne = error.readLine()) != null) {
 System.out.println(ligne);
}
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