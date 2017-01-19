// Methods in this file will end up as object methods on the object that load returns.

def executePowershell(){
    echo "IN executePowershell"
	
    "mkdir foo".execute()
    
	echo "IN executePowershell:: After execute call"

}


return this;