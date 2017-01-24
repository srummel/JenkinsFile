// Methods in this file will end up as object methods on the object that load returns.
import java.io.File 


def updatePacLog(text){

    echo "** externalMethod.updatePacLog::Start **"

	def workspaceLocation = new File(getClass().protectionDomain.codeSource.location.path).absolutePath 
	File f = new File(workspaceLocation + "/PAC.log")
    f.append(text + '\r\n')
	
    echo "** externalMethod.updatePacLog::Finish **"
}
def startStage(){

    echo "** externalMethod.startStage::Start **"

	File f = new File("C:/tmp/PAC.log")
	f.append(new File(getClass().protectionDomain.codeSource.location.path).absolutePath + 'PAC.log\r\n')
	
    echo "** externalMethod.startStage::Finish **"
}
 
return this;

    echo "** externalMethod.updatePacLog::Finish **"
