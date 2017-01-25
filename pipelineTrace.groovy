
def startStage(location, buildNumber, buildEnvironment, stage){
    echo "** externalMethod.startStage::Start **"

	File f = new File(location + "/PAC.log")
	def timeStamp = new Date().format('yyyy-MM-dd HH:mm:ss.SSS')
    f.append([timeStamp, buildNumber, buildEnvironment].join("; ") + "Begin " + stage + '\r\n')
	
    echo "** externalMethod.startStage::Finish **"
}
    return this;

    echo "** externalMethod.updatePacLog::Finish **"
