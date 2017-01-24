package com.servicemaster.devops.build.log

// Methods in this file will end up as object methods on the object that load returns.
class PipelineLog implements Serializable {
    def buildTraceFileName = 'PAC.log'
//    def static defaultFileLocation = getClass().protectionDomain.codeSource.location.path
    def static defaultTimeStamp = "yyy-MM-ddTHH:mm:ss.fff"
    File buildLog = null

    void startPipeline(){
        // update pac.log with start template
        buildLog = getTraceFile()
        buildLog.println("This is the beginning")
        Calendar.getInstance().format("yyy-MM-ddTHH:mm:ss.fff")

        File f = new File(location + "/PAC.log")
        def timeStamp = Calendar.getInstance().format("yyy-MM-ddTHH:mm:ss.fff")
private static final String SEPARATOR = ";"
        f.append([timeStamp, buildNumber, buildEnvironment].join(SEPARATOR) +  '\r\n')


    }

    void addTimestamp(fileName) {
        println "PipelineLog.addTimestamp::Start"
        Calendar cal = Calendar.getInstance();

        File file = getFile(fileName)
        file.println(defaultFileLocation)
        file.append(Calendar.instance.time.format(defaultTimeStamp) )

        println "PipelineLog.addTimestamp::Finish"
    }


    void addTimestamp(dir, fileName) {
        println "PipelineLog.addTimestamp::Start"
        Calendar cal = Calendar.getInstance();

        File file = new File(dir + fileName)
        file.println(defaultFileLocation)

        println "PipelineLog.addTimestamp::Finish"
    }

    void addLine(fileName, line) {
        println "PipelineLog.addTimestamp::Start"
        buildLog = getTraceFile()

        Calendar cal = Calendar.getInstance()
        buildLog.println(cal.toString())
        println "PipelineLog.addTimestamp::Finish"
    }

    void writeLine(fileName, line){

    }

    def writeLinesToFile(def directory, def fileName, def extension, def infoList) {
        new File("$directory/$fileName$extension").withWriter { out ->
            infoList.each {
                out.println it
            }
        }
    }

    private File getTraceFile(){
        if (buildLog == null){
            // Initialize
            buildLog = new File('PAC.log')
        }


    }

    private File getFile(dir, String fileName) {
        String location = defaultFileLocation
        if(dir == null){
            location = dir
        }
        // Validate that location ends with a / to be able to append file name

        new File(location + fileName)
    }

}