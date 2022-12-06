import http from '../http-common';

class studentServices {
    create(data) {
        return http.post("/students/insert", data);
    }

    getAll() {
        return http.get("/students/getAll");
    }


    getData(id) {
        return http.get(`/students/getData/${id}`)
    }
}

export default new studentServices();