package storage;

import model.Teacher;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileTeacher implements IReadWriteFileTeacher {
    public static final String PATHNAME_TEACHER = "teacherList.txt";

    public void writeFile(List<Teacher> students){
        File fileTeacher = new File(PATHNAME_TEACHER);
        try {
            OutputStream opsTeacher = new FileOutputStream(fileTeacher);
            ObjectOutputStream oosTeacher =  new ObjectOutputStream(opsTeacher);
            oosTeacher.writeObject(students);
            oosTeacher.close();
            opsTeacher.close();
            oosTeacher.writeObject(students);
        } catch (IOException e) {
            System.out.println("Saved");
        }
    }

    public List<Teacher> readFile(){
        File fileTeacher = new File(PATHNAME_TEACHER);
        if (!fileTeacher.exists()) {
            return getTeacher();
        }
        try {
            InputStream isTeacher = new FileInputStream(fileTeacher);
            ObjectInputStream oisTeacher = new ObjectInputStream(isTeacher);
            Object object = oisTeacher.readObject();
            return (List<Teacher>) object;
        } catch (FileNotFoundException e) {
            System.out.println("Loi doc file" + e.getMessage());
            return getTeacher();
        } catch (IOException e) {
            System.out.println("Loi doc file" + e.getMessage());
            return getTeacher();
        } catch (ClassNotFoundException e) {
            System.out.println("Loi doc file" + e.getMessage());
            return getTeacher();
        }
    }
    public List<Teacher> getTeacher(){
        List<Teacher> listTeacher = new ArrayList<>();
        listTeacher.add(new Teacher());
        writeFile(listTeacher);
        return listTeacher;
    }
}
