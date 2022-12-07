import http from '../http-common';

class studentServices {
    // Create Data
    create(data) {
        return http.post("/students/insert", data);
    }

    // Get All Data
    getAll() {
        return http.get("/students/getAll");
    }


    // Get Data
    getData(id) {
        return http.get(`/students/student/${id}`)
    }

    updateData(id, data) {
        return http.put(`/students/update/${id}`, data)
    }

    delete(id) {
        return http.delete(`/students/delete/${id}`)
    }
}

export default new studentServices();