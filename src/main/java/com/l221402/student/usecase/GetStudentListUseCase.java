package com.l221402.student.usecase;

import java.util.List;

import com.l221402.student.entity.Student;

public class GetStudentListUseCase implements GetStudentListInputBoundary{
    private GetStudentListOutputBoundary getSLOutputBoundary = null;
    private GetStudentListDatabaseBoundary getSLDBBoundary = null;

    

    public GetStudentListUseCase(GetStudentListOutputBoundary getSLOutputBoundary,
            GetStudentListDatabaseBoundary getSLDBBoundary) {
        this.getSLOutputBoundary = getSLOutputBoundary;
        this.getSLDBBoundary = getSLDBBoundary;
    }



    @Override
    public void execute() {

        //lay danh sach sin hvien
        List<Student> listStudent = getSLDBBoundary.getAllStudentList();
        DataExport dataExport = new DataExport(listStudent);
        getSLOutputBoundary.exportResult(dataExport);
    }

}
