/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author YueZheng
 */
public class CommentsWorkRequest extends WorkRequest {

    public CommentsWorkRequest() {
        super();
    }

    @Override
    public String toString() {
        return this.getSender().getPerson().getName();
    }
}
