//package Zerobase;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
//public class FileUtils{
//
//    /**
//     * 전달된 파일경로에서 파일 내용을 리턴
//     */
//        public String getLoadText(String filePath){
//            StringBuilder sb = new StringBuilder();
//
//            try {
//                Path path = Paths.get(filePath);
//                List<String> lines = Files.readAllLines(path);
//                for (int i = 0; i < lines.size(); i++) {
//                    if (i > 0) {
//                        sb.append("\n");
//                    }
//                    sb.append(lines.get(i));
//                }
//            } catch (IOExceptionn e){
//                e.printStackTrace();
//            }
//
//            return sb.toString();
//        }
//}
