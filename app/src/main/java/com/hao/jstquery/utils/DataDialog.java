package com.hao.jstquery.utils;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;

import java.util.Calendar;

public class DataDialog {
    public static void showtime(Context context,DataCallBack callBack) {
        Calendar calendar = Calendar.getInstance();//调用Calendar类获取年月日
        int  mYear = calendar.get(Calendar.YEAR);//年
        int  mMonth = calendar.get(Calendar.MONTH);//月份要加一个一，这个值的初始值是0。不加会日期会少一月。
        int  mDay = calendar.get(Calendar.DAY_OF_MONTH);//日
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                callBack.getData(i + "-" + (i1+1) + "-" + i2);
            }
        }, mYear,mMonth, mDay);//将年月日放入DatePickerDialog中，并将值传给参数
        datePickerDialog.show();//显示dialog
    }

    public interface DataCallBack{
        void getData(String data);
    }
}
