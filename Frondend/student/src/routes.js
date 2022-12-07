import MainPage from "./pages/MainPage.vue"
import AddData from "./pages/AddData.vue"

export default [
    {
        path: '/',
        component: MainPage
    },
    {
        path: '/add',
        component: AddData
    },
    {
        path: `/update/:id`,
        component: AddData
    }

]

