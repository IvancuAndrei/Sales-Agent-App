import React from "react";
import { useTable } from "react-table";
import { COLUMNS } from "../../types/column.js";

const InventoryTable = () => {
  useTable({
    columns: COLUMNS,
    data: [],
  });
  return <div>InventoryTable</div>;
};

export default InventoryTable;
