import React, { useEffect } from "react";

const FlowchartNodes = () => {
  useEffect(() => {
    const diagram = window.flowchart.parse(`
      st=>start: Start Program
      dim=>operation: Set dimensions
      gen=>operation: Generate 3D Array
      init=>operation: Initialize Array
      loop=>operation: Loop through positions
      fill=>operation: Fill random values
      ret=>operation: Return array
      prompt=>inputoutput: Prompt user
      read=>inputoutput: Read number
      setFalse=>operation: numberFound = false
      search=>operation: Loop through i,j,k
      check=>condition: array[i][j][k] == num?
      found=>inputoutput: Print "Found"
      setTrue=>operation: numberFound = true
      brk=>operation: Break loops
      checkFound=>condition: numberFound == false?
      notFound=>inputoutput: Print "Not found"
      e=>end: End Program

      st->dim->gen->init->loop->fill->ret->prompt->read->setFalse->search->check
      check(yes)->found->setTrue->brk->checkFound
      check(no)->search
      checkFound(yes)->notFound->e
      checkFound(no)->e
    `);

    // Draw the flowchart
    diagram.drawSVG("flowchart", {
      x: 0,
      y: 0,
      "line-width": 2,
      "line-length": 50,
      "text-margin": 10,
      "font-size": 14,
      "font-color": "#333",
      "line-color": "#333",
      "element-color": "#333",
      fill: "white",
      "yes-text": "yes",
      "no-text": "no",
      "arrow-end": "block",
      scale: 1,
      symbols: {
        start: {
          "font-color": "white",
          "element-color": "#00bcd4",
          fill: "#00bcd4",
        },
        end: {
          "font-color": "white",
          "element-color": "#673ab7",
          fill: "#673ab7",
        },
        operation: {
          "font-color": "#333",
          "element-color": "#fb8c00",
          fill: "#fff3e0",
        },
        inputoutput: {
          "font-color": "#333",
          "element-color": "#00897b",
          fill: "#e0f2f1",
        },
        condition: {
          "font-color": "#333",
          "element-color": "#f06292",
          fill: "#fce4ec",
        },
      },
    });
  }, []);

  return (
    <div style={{ width: "100%", height: "100%", overflow: "auto" }}>
      <div id="flowchart" style={{ width: "100%", minHeight: "800px" }}></div>
    </div>
  );
};

export default FlowchartNodes;
