// Methods in this file will end up as object methods on the object that load returns.
import java.io.File 
import java.util.Date

def startStage(location, buildNumber, buildEnvironment){
    echo "** externalMethod.startStage::Start **"

	File f = new File(location + "/PAC.log")
	def timeStamp = new Date().format('yyy-MM-ddHH:mm:ss.fff')
    f.append([timeStamp, buildNumber, buildEnvironment].join(";") +  '\r\n')
	
    echo "** externalMethod.startStage::Finish **"
}
 
return this;

    echo "** externalMethod.updatePacLog::Finish **"
