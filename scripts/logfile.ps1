## This module is written to log details in PAC.log file on workspace.

param(
    [string]$comment,
    [string]$WORKSPACE,
    [string]$buildnumber,
    [string]$branchname,
    [string]$git
)

##$date = (Get-Date -format u).ToString()

$date = (Get-Date -format yyyy-MM-ddTHH:mm:ss.fff).ToString()
echo 1
if ($git -eq "YES")
{
echo 2
$git_details = git show --stat --format="Hash %H; Parents (%P); %cI; %cNj; %cE; %s"
$date + "; " + $buildnumber + "; " + $branchname + "; " + $git_details           | Out-File -Encoding Default $ENV:WORKSPACE\PAC.log -Append

$git_log = git log --shortstat --max-count=100 --pretty=fuller
$git_log | Out-File -Encoding Default $ENV:WORKSPACE\Git.log -Append
}
else
{
echo 3
$date + "; " + $buildnumber + "; " + $branchname + "; " + $comment           | Out-File -Encoding Default $ENV:WORKSPACE\PAC.log -Append
}

echo "Writing into log file"
