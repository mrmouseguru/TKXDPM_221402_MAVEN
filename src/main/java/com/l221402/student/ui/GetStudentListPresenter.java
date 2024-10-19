package com.l221402.student.ui;

import java.util.List;

import com.l221402.student.usecase.DataExport;
import com.l221402.student.usecase.GetStudentListOutputBoundary;
import com.l221402.student.usecase.GetStudentListOutputDTO;
import com.l221402.student.usecase.ResponseData;

public class GetStudentListPresenter implements GetStudentListOutputBoundary{
    private DataExport dataExport = null;
    private List<GetStudentListOutputDTO> listOutputDTO = null;

    @Override
    public void exportResult(ResponseData responseData) {
        this.dataExport = (DataExport)responseData;
    }

    public DataExport getDataExport() {
        return dataExport;
    }

    @Override
    public void present(List<GetStudentListOutputDTO> listOutDTO) {
        this.listOutputDTO = listOutDTO;
    }

    public List<GetStudentListOutputDTO> getListOutputDTO() {
        return listOutputDTO;
    }

}
