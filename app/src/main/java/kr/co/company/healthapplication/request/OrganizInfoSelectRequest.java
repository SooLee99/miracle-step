package kr.co.company.healthapplication.request;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class OrganizInfoSelectRequest extends StringRequest {
    final static private String URL = "http://miraclestep01.dothome.co.kr/SelectOrganizInfo.php";
    private Map<String, String> map;

    public OrganizInfoSelectRequest(String id, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("id", id);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}