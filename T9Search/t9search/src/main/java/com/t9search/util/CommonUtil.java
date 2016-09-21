/*
 * Copyright  [handsomezhou] 2016 The T9 search Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.t9search.util;

public class CommonUtil {

	public static boolean isEmpty(String value){
		boolean empty=true;
        
        if((null==value)||(value.length()<=0)){
            empty=true;
        }else{
            empty=false;
        }
        
        return empty;
    }

}
