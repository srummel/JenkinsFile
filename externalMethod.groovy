// Methods in this file will end up as object methods on the object that load returns.
import java.io.File 


def updatePacLog(text){

    echo "** externalMethod.updatePacLog::Start **"
Calendar cal=Calendar.getInstance();


	File f = new File("C:/tmp/PAC.log")
	f.append(new File(getClass().protectionDomain.codeSource.location.path).absolutePath + '\r\n')
    f.append(text + '\r\n')
	
    echo "** externalMethod.updatePacLog::Finish **"
}
 
return this;