import PubSub from '../helpers/pub_sub.js';

// const InstrumentFamilyView = function (container) {
//   this.container = container;
// };

class InstrumentFamilyView{
  constructor(container){
    this.container = container;
  }

  // InstrumentFamilyView.prototype.bindEvents = function () {
  //   PubSub.subscribe('InstrumentFamilies:selected-family-ready', (evt) => {
  //     const instrumentFamily = evt.detail;
  //     this.render(instrumentFamily);
  //   });
  // };
  bindEvents() {
    PubSub.subscribe('InstrumentFamilies:selected-family-ready', (evt) => {
      const instrumentFamily = evt.detail;
      this.render(instrumentFamily);
    });

  }
  // InstrumentFamilyView.prototype.render = function (family) {
  //   this.container.innerHTML = '';
  render({name, description, instruments}) {
    this.container.innerHTML = '';

    //   const familyName = this.createElement('h2', family.name);
    //   this.container.appendChild(familyName);
    //
    const familyName = this.createElement('h2', name);
    this.container.appendChild(familyName);

    //   const familyDescription = this.createElement('p', family.description);
    //   this.container.appendChild(familyDescription);
    //
    const familyDescription = this.createElement('p', description);
    this.container.appendChild(familyDescription);

    //   const instrumentListTitle = this.createElement('h3', 'Instruments include:');
    //   this.container.appendChild(instrumentListTitle);
    //
    const instrumentListTitle = this.createElement('h3', 'Instruments include:');
    this.container.appendChild(instrumentListTitle);

    //   const instrumentList = this.createInstrumentList(family.instruments);
    //   this.container.appendChild(instrumentList);
    // };
    const instrumentList = this.createInstrumentList(instruments);
    this.container.appendChild(instrumentList);
  };

  // InstrumentFamilyView.prototype.createElement = function (elementType, text) {
  //   const element = document.createElement(elementType);
  //   element.textContent = text;
  //   return element;
  // };
  createElement(elementType, text) {
    const element = document.createElement(elementType);
    element.textContent = text;
    return element;
  };


  // InstrumentFamilyView.prototype.createInstrumentList = function (instruments) {
  //   const list = document.createElement('ul');
  //
  //   instruments.forEach((instrument) => {
  //     const listItem = document.createElement('li');
  //     listItem.textContent = instrument;
  //     list.appendChild(listItem);
  //   });
  createInstrumentList(instruments) {
    const list = document.createElement('ul');

    instruments.forEach((instrument) => {
      const listItem = document.createElement('li');
      listItem.textContent = instrument;
      list.appendChild(listItem);
    });

    return list;
  };

  }






//






//

//
//   return list;
// };

// module.exports = InstrumentFamilyView;
export default InstrumentFamilyView;
