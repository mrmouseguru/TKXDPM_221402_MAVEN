package com.l221402.student.ui;

import com.l221402.student.usecase.DataExport;
import com.l221402.student.usecase.GetStudentListOutputBoundary;
import com.l221402.student.usecase.ResponseData;

public class GetStudentListPresenter implements GetStudentListOutputBoundary{
    private DataExport dataExport = null;

    @Override
    public void exportResult(ResponseData responseData) {
        this.dataExport = (DataExport)responseData;
    }

    public DataExport getDataExport() {
        return dataExport;
    }

}
