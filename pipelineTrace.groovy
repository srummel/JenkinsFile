// Methods in this file will end up as object methods on the object that load returns.
import java.io.File 
import java.util.Calendar

def startStage(location, buildNumber, buildEnvironment){
    echo "** externalMethod.startStage::Start **"
//    private static final 
	String SEPARATOR = ";"

	File f = new File(location + "/PAC.log")
	def timeStamp = Calendar.getInstance().format("yyy-MM-ddTHH:mm:ss.fff")
	
        f.append([timeStamp, buildNumber, buildEnvironment].join(SEPARATOR) +  '\r\n')
	
    echo "** externalMethod.startStage::Finish **"
}
 
return this;

    echo "** externalMethod.updatePacLog::Finish **"
