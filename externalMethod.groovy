// Methods in this file will end up as object methods on the object that load returns.
import java.io.File 


def updatePacLog(text){

    echo "** externalMethod.updatePacLog::Start **"
Calendar cal=Calendar.getInstance();


	f.append(new File(getClass().protectionDomain.codeSource.location.path).absolutePath + 'PAC.log\r\n')
    f.append(text + '\r\n')
	
    echo "** externalMethod.updatePacLog::Finish **"
}
def startStage(){

    echo "** externalMethod.startStage::Start **"

	f.append(new File(getClass().protectionDomain.codeSource.location.path).absolutePath + 'PAC.log\r\n')
	
    echo "** externalMethod.startStage::Finish **"
}
 
return this;