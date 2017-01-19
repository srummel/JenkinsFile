// Methods in this file will end up as object methods on the object that load returns.
def lookAtThis(String whoAreYou) {
    echo "Look at this, ${whoAreYou}! You loaded this from another file!"
}

def executePowershell(){
    echo "IN executePowershell"
"C:\_development\_projects\WORK\JenkinsFile\scripts>C:\Windows\System32\WindowsPowerShell\v1.0\powershell.exe -ExecutionPolicy ByPass  -File  logfile.ps1".exe

}


return this;