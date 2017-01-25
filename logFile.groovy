def copyLogFile(dir, fileToMove){
   echo "Internal_Method::logFile.copyLogFile::Start **"

//  File file = new File(fileToMove);  
//  File dir = new File(dir);  
//  boolean fileMoved = file.renameTo(new File(dir, file.getName()));  

   echo "Internal_Method::logFile.copyLogFile::Finish **"
}



def startStage(location, buildNumber, buildEnvironment, stage){
    echo "** pipelineTrace.startStage::" + stage + "::Start **"

	File f = new File(location + "/PAC.log")
	def timeStamp = new Date().format('yyyy-MM-dd HH:mm:ss.SSS')
    f.append([timeStamp, buildNumber, buildEnvironment].join("; ") + " ::Begin " + stage + '\r\n')
	
    echo "** pipelineTrace.startStage::" + stage + "::Finish **"
}



return this;



