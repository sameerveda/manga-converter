package samrock.converters.app.main;
import java.util.List;

import com.beust.jcommander.Parameter;

class Utils2 {
    @Parameter
    List<String> args;
    
    @Parameter(names= { "-cfnc", "--check-folders-not-converted" },description = "Check Folders Not Converted")
    public boolean checkFoldersNotConverted;
    
    @Parameter(names= {"-cau","--cleanups-and-updates"},description = "Cleanups And Updates")
    public boolean cleanupsAndUpdates;

}