// Methods in this file will end up as object methods on the object that load returns.
import java.io.File 


def updatePacLog(text){
    echo "** externalMethod.updatePacLog::Start **"

	File f = new File("C:/tmp/PAC.log")
	f.append(new File(getClass().protectionDomain.codeSource.location.path).parent + '\n')
    f.append(text + '\n')
	
    echo "** externalMethod.updatePacLog::Finish **"
}
 
return this;