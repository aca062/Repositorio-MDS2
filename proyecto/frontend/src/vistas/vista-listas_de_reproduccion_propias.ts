import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-listas_de_reproduccion_propias')
export class VistaListas_de_reproduccion_propias extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h1 id="h1">Heading 1</h1>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 70%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 8%; justify-content: flex-end; align-items: center;">
  <vaadin-button>
   Ver más
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
