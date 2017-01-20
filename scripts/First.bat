@echo OFF

@echo %time%
ping -n 1 -w 1 127.0.0.1 1>nul
@echo %time%

mkdir c:/tmp/bar