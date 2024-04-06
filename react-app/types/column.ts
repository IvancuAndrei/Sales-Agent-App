import { Column } from "react-table";


export const COLUMNS : Column[] = [
    {
        Header:'Id',
        accessor: 'id'
    },
    {
        Header:'Name',
        accessor: 'name'
    },
    {
        Header:'Quantity',
        accessor:'quantity'
    },
    {
        Header:'Price',
        accessor:'price'
    },
    {
        Header:'Buy',
        accessor:'buy'
    }
] 

