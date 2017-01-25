
def startStage(location, buildNumber, buildEnvironment, stage){
    echo "** externalMethod.startStage::Start **"

	File f = new File(location + "/PAC.log")
	def timeStamp = new Date().format('yyyy-MM-dd HH:mm:ss.SSS')
    f.append([timeStamp, buildNumber, buildEnvironment].join("; ") + " ::Begin " + stage + '\r\n')
	
    echo "** externalMethod.startStage::" + stage + "::Finish **"
}


def endStage(location, buildNumber, buildEnvironment, stage){
    echo "** externalMethod.endStage::Start **"

	File f = new File(location + "/PAC.log")
	def timeStamp = new Date().format('yyyy-MM-dd HH:mm:ss.SSS')
    f.append([timeStamp, buildNumber, buildEnvironment].join("; ") + " ::Complete " + stage + '\r\n')
	
    echo "** externalMethod.endStage::" + stage + "::Finish **"
}

return this;
