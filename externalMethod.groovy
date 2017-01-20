// Methods in this file will end up as object methods on the object that load returns.
import java.io.File 


def updatePacLog(text){
    echo "** externalMethod.updatePacLog::Start **"

	File f = new File("C:/tmp/PAC.log")
    f.append(text)
	
    echo "** externalMethod.updatePacLog::Finish **"
}
 
return this;