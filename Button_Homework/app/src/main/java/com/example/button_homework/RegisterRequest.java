package com.example.button_homework;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest{

    final static private  String URL = "http://jkey20.cafe24.com/jkey20dbedit/regist_problem.php";
    private Map<String,String> parameters;

    public RegisterRequest(String field, String name, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("field",field);
        parameters.put("name",name);
    }

    @Override
    public Map<String,String>getParams(){
        return parameters;
    }
}

