import React from "react";
import FlowchartNodes from "./FlowchartNodes";

const App = () => {
  return (
    <div style={{ padding: "20px", maxWidth: "1200px", margin: "0 auto" }}>
      <h1 style={{ textAlign: "center", marginBottom: "30px" }}>
        3D Array Generation and Number Search Flowchart
      </h1>
      <FlowchartNodes />
    </div>
  );
};

export default App;
