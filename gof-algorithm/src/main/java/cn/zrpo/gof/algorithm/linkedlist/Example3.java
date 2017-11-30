package cn.zrpo.gof.algorithm.linkedlist;

import cn.zrpo.gof.algorithm.linkedlist.support.SystemTree;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 递归查找文件列表
 * @author zhanggl
 */
public class Example3 {

    static String path = "F:\\WeWork";
    static Integer rootId = 0;
    public static void main(String[] args) {
        //new Example3().getFile(new File(path));
        SystemTree systemTree = new SystemTree();
        systemTree.setName("根节点");
        systemTree.setId(rootId);
        systemTree.setPid(null);
        new Example3().getFileTree(new File(path),systemTree);

    }

    public void getFile(File file){
        if(file!=null && file.listFiles() !=null){

            File[] files = file.listFiles();
            for (File f: files) {
                if(f.isDirectory()){
                    System.out.println(f.getAbsolutePath());
                    getFile(f);
                }else {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }

    /**
     *   F:\WeWork\1688850596277143\Index
         F:\WeWork\1688850596277143\Index\announce_index.db
         F:\WeWork\1688850596277143\Index\announce_index.db-shm
         F:\WeWork\1688850596277143\Index\announce_index.db-wal
         F:\WeWork\1688850596277143\Index\announce_index_log.db
         F:\WeWork\1688850596277143\Index\announce_index_log.db-shm
         F:\WeWork\1688850596277143\Index\announce_index_log.db-wal
     * @param file
     */
    public void getFileTree(File file,SystemTree rootTree){
        List<SystemTree> systemTreeList = new ArrayList<>();

        File[] files = file.listFiles();
        for (File f: files) {
            if(f.isDirectory()){
                SystemTree tree = new SystemTree();
                String name = f.getName();
                Integer id = rootId++;
                tree.setId(id);
                tree.setName(name);
                tree.setPid(rootTree.getId());
                systemTreeList.add(tree);
            }else {
                SystemTree tree = new SystemTree();
                String name = f.getName();
                Integer id = rootId++;
                tree.setId(id);
                tree.setName(name);
                tree.setPid(rootTree.getId());
            }
        }

        System.out.println(systemTreeList);

    }

}
