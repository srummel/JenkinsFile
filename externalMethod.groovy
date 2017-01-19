// Methods in this file will end up as object methods on the object that load returns.
def lookAtThis(String whoAreYou) {
    echo "Look at this, ${whoAreYou}! You loaded this from another file!"
}

def executePowershell(){
    echo "IN executePowershell"
	
    "cmd /c ls -ltra".execute()
    
	echo "IN executePowershell:: After execute call"

}


return this;