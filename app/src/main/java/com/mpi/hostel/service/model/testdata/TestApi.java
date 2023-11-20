
package com.mpi.hostel.service.model.testdata;
import java.util.List;

import java.time.OffsetDateTime;
public class TestApi {
    private InstituteData instituteData;
    private String regulation;
    private List<ResultDatum> resultData;
    private boolean success;
    private String roll;
    private OffsetDateTime time;

    public InstituteData getInstituteData() { return instituteData; }
    public void setInstituteData(InstituteData value) { this.instituteData = value; }

    public String getRegulation() { return regulation; }
    public void setRegulation(String value) { this.regulation = value; }

    public List<ResultDatum> getResultData() { return resultData; }
    public void setResultData(List<ResultDatum> value) { this.resultData = value; }

    public boolean getSuccess() { return success; }
    public void setSuccess(boolean value) { this.success = value; }

    public String getRoll() { return roll; }
    public void setRoll(String value) { this.roll = value; }

    public OffsetDateTime getTime() { return time; }
    public void setTime(OffsetDateTime value) { this.time = value; }
}

